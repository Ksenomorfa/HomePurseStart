package ru.homepurse.pojo;

public class Category {
    private final Long id;
    private String name;

    public Category(String name) {
        this.id = null;
        this.name = name;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    @Override
    public int hashCode() {
        return id.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        Category category = null;
        if (obj instanceof Category) {
            category = (Category) obj;
        }
        return category != null &&
                this.getId().equals(category.getId());
    }
}
