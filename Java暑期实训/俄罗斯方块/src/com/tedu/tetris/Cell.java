package com.tedu.tetris;

import java.awt.Image;

/**格子类*/
public class Cell {
	private int row;//行
	private int col;//列
	private Image image;//贴图
	public Cell(int row, int col, Image image) {
		super();
		this.row = row;
		this.col = col;
		this.image = image;
	}
	public int getRow() {
		return row;
	}
	public void setRow(int row) {
		this.row = row;
	}
	public int getCol() {
		return col;
	}
	public void setCol(int col) {
		this.col = col;
	}
	public Image getImage() {
		return image;
	}
	public void setImage(Image image) {
		this.image = image;
	}
	public void drop(){
		row++;
	}
	public void moveLeft(){
		col--;
	}
	public void moveRight(){
		col++;
	}
	public String toString(){
		return row+","+col;
	}
	
}
