package com.restroo.services;

import java.util.List;

import com.restroo.entity.MenuItems;

public interface MenuItemsService {
	public void addItems(MenuItems menuItems);
	public void deleteItems(MenuItems menuItems);
	public void updateItems();
	public MenuItems getByItemName(String itemName);
	public List<MenuItems> listMenuItems();
}
