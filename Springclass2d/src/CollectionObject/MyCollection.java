package CollectionObject;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class MyCollection {
	ArrayList<String> fruits;
	HashSet<String> setfruits;
	HashMap<String,Integer> fruitrange;
	ArrayList<Fruits> listFruitObject;
	public ArrayList<String> getFruits() {
		return fruits;
	}
	public void setFruits(ArrayList<String> fruits) {
		this.fruits = fruits;
	}
	public HashSet<String> getSetfruits() {
		return setfruits;
	}
	public void setSetfruits(HashSet<String> setfruits) {
		this.setfruits = setfruits;
	}
	public HashMap<String, Integer> getFruitrange() {
		return fruitrange;
	}
	public void setFruitrange(HashMap<String, Integer> fruitrange) {
		this.fruitrange = fruitrange;
	}
	public ArrayList<Fruits> getListFruitObject() {
		return listFruitObject;
	}
	public void setListFruitObject(ArrayList<Fruits> listFruitObject) {
		this.listFruitObject = listFruitObject;
	}
	@Override
	public String toString() {
		return "MyCollection [fruits=" + fruits + ", setfruits=" + setfruits + ", fruitrange=" + fruitrange
				+ ", listFruitObject=" + listFruitObject + "]";
	}
	

}
