package com.example.task_4;

public class ListItem {
    private int iconResId;
    private String title;

    public ListItem(int iconResId, String title) {
        this.iconResId = iconResId;
        this.title = title;
    }

    public int getIconResId() {
        return iconResId;
    }

    public String getTitle() {
        return title;
    }
}