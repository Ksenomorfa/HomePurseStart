package ru.homepurse.pojo;

public class Category {

    private final Long id = 1L;
    private String name;

    public Category(String name) {
        this.name = name;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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

    @Override
    public String toString() {
        return "Category{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }

}
