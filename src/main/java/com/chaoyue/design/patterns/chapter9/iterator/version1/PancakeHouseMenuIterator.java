package com.chaoyue.design.patterns.chapter9.iterator.version1;

import java.util.List;

public class PancakeHouseMenuIterator implements Iterator {
    private List<MenuItem> items;
    private int position = 0;

    public PancakeHouseMenuIterator(List<MenuItem> items) {
        this.items = items;
    }

    @Override
    public boolean hasNext() {
        return position < items.size() && items.get(position) != null;
    }

    @Override
    public Object next() {
        MenuItem menuItem = items.get(position);
        position++;
        return menuItem;
    }
}
