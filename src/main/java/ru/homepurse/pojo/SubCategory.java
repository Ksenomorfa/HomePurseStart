package ru.homepurse.pojo;

public class SubCategory {
    private final Long id = 1L;
    private String name;
    private Category category;

    public SubCategory(String name, Category category) {
        this(category);
        this.name = name;
    }

    public SubCategory(Category category) {
        this.category = category;
    }

    public SubCategory() {
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Category getCategory() {
        return category;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    @Override
    public int hashCode() {
        return id.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        SubCategory subCategory = null;
        if (obj instanceof SubCategory) {
            subCategory = (SubCategory) obj;
        }
        return subCategory != null &&
                this.getId().equals(subCategory.getId());
    }

    @Override
    public String toString() {
        return "SubCategory{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", category=" + category.getName() +
                '}';
    }
}
