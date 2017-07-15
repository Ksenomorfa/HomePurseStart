package ru.homepurse.pojo;

public class SubCategory {
    private final Long id;
    private String name;
    private Category category;

    public SubCategory(String name, Category category) {
        this.id = null;
        this.name = name;
        this.category = category;
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
        SubCategory subCategory = null;
        if (obj instanceof SubCategory) {
            subCategory = (SubCategory) obj;
        }
        return subCategory != null &&
                this.getId().equals(subCategory.getId());
    }
}
