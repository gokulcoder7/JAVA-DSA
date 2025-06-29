
	public void display(){
	
display(this.root);
	
	
	
}
	
	
public void display(Node root){
	String st="";
	if(root==null){
	return ;
	

	}
	else{
		
	st=st+"interval===["+root.startinterval+"-"+root.endinterval+"]  data=="+root.data;
	}
	
	
	if(root.left!=null){
		st=st+"interval===["+root.left.startinterval+"-"+root.left.endinterval+"]  data=="+root.left.data;
	}
	else{
		System.out.println("no left child");
	}
	
	
	
		if(root.right!=null){
		st=st+"interval===["+root.right.startinterval+"-"+root.right.endinterval+"]  data=="+root.right.data;
	}
	else{
		System.out.println("no right child");
	}
	
	
	
	
		System.out.println(st);
	

	
	
	if(root.left!=null){
		display(root.left);
	}
	
		if(root.right!=null){
		display(root.right);
	}
	
	

}
