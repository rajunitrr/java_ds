package com.design;

import java.util.HashMap;

class Node {

	int key;
	int value;
	Node prev;
	Node next;

	Node(int key, int value) {
		this.key = key;
		this.value = value;
	}

	@Override
	public String toString() {
		return "Node [key=" + key + ", value=" + value + ", prev=" + prev + ", next=" + next + "]";
	}

}

public class LRUCache {

	private static final int CAPACITY = 4;
	private HashMap<Integer, Node> cache;
	private Node start;
	private Node end;

	public LRUCache() {
		this.cache = new HashMap<>();
		this.start = null;
		this.end = null;
	}

	public void putEntry(int key, int value) {

		if (cache.containsKey(key)) {
			Node node = removeEntry(key);
			node.value = value;
			node.next = start;
			start.prev = node;
			start = node;
			cache.put(key, node);

		}
		else {

			Node entry = new Node(key, value);
			if (start == null) {
				start = entry;
				end = entry;
			} else {
				System.out.println("cache size "+cache.size());

				if (cache.size() >= CAPACITY) {
					System.out.println("Cache is full and removing lasst node "+end.key);
					cache.remove(end.key);
					end.next = null;
					end = end.prev;
				}
				entry.next = start;
				start.prev = entry;
				start = entry;
			}
			
			cache.put(key, entry);

		}

	}

	public int getEntry(int key) {

		if (cache.containsKey(key)) {
			return cache.get(key).value;
		}
		return -1;
	}

	private Node removeEntry(int key) {

		Node node = cache.get(key);
		node.prev = node.next;
		node.next.prev = node.prev;

		return node;
	}

	private HashMap<Integer, Node> getCache(){
		return cache;
	}
	public static void main(String[] args) {

		LRUCache cache = new LRUCache();
		cache.putEntry(1, 2);
		cache.putEntry(2, 3);
		cache.putEntry(3, 4);
		cache.putEntry(4, 5);
		cache.putEntry(5, 6);
		cache.putEntry(4, 7);


		System.out.println(cache.getEntry(4));

	}

}
