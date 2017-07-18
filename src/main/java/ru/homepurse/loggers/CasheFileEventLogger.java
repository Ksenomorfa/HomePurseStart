package ru.homepurse.loggers;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class CasheFileEventLogger extends FileEventLogger {
    private int cacheSize;
    private List<Event> cache;

    public CasheFileEventLogger(String filename, int cacheSize) {
        super(filename);
        this.cacheSize = cacheSize;
        cache = new ArrayList<>();
    }

    public int getCacheSize() {
        return cacheSize;
    }

    public void setCacheSize(int cacheSize) {
        this.cacheSize = cacheSize;
    }

    public List<Event> getCache() {
        return cache;
    }

    public void setCache(List<Event> cache) {
        this.cache = cache;
    }

    public void logEvent(Event event) throws IOException {
        cache.add(event);
        if (cache.size() == cacheSize) {
            writeEventsFromCache();
            cache.clear();
        }
    }

    private void writeEventsFromCache() throws IOException {
        for (Event e : cache) {
            super.logEvent(e);
        }
    }

    public void destroy() throws IOException {
        if (!cache.isEmpty()) {
            writeEventsFromCache();
        }
        cache.clear();
    }
}
