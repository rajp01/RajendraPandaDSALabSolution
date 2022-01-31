package com.greatlearning.TreePath;

import java.util.ArrayList;

public class LongestPath {
	
	public static ArrayList<Integer> longestPath(Node root){
		if (root == null) {
			ArrayList<Integer> output= new ArrayList<>();
			return output;
		}	
		ArrayList<Integer> rightNode = longestPath(root.rightNode);
		ArrayList<Integer> leftNode = longestPath(root.leftNode);
			
		if(rightNode.size() < (leftNode.size())){
				leftNode.add(root.nodeData);
			}else {
				rightNode.add(root.nodeData);
			}
		return(leftNode.size() > rightNode.size() ? leftNode : rightNode);
		
	}

}		





