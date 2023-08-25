package com.example.Projeto_Demeter.entity;


	import java.util.ArrayList;
	import java.util.List;

	public class Cart {
	    private List<Item> items;

	    public Cart() {
	        items = new ArrayList<>();
	    }

	    public void addItem(Item item) {
	        items.add(item);
	    }

	    public void removeItem(Item item) {
	        items.remove(item);
	    }

	    public List<Item> getItems() {
	        return items;
	    }

	    public double getTotal() {
	        double total = 0;
	        for (Item item : items) {
	            total += item.getPrice() * item.getQuantity();
	        }
	        return total;
	    }
	}

