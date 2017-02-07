/*
 * @author:Mr.wang
 * @function:循环链表
 * @date:2017.2.7
 * 
 */
package com.wang;

public class Jose_1 {

	public static void main(String[] args) {
		Link l=new Link(4);
		l.createLink();
		l.visitLink();
	}
}
class Chi{
	int num;
	Chi next;
	public Chi(int num){
		this.num=num;
	}
}
class Link{
	int len;
	Chi temp;
	Chi firstChi;
	public Link(int len){
		this.temp=null;
		this.firstChi=null;
		this.len=len;
	}
	void createLink(){
		Chi ch=null;//本版本相比于Jose而言，在栈内存中只开辟了一个Chi ch引用，但其作用域延长至整个方法
		//而Jose中虽然在for循环里创建了大量的Chi ch引用，但作用域只在代码块中
		//如果从垃圾回收机制（GC）的角度来看的话本版本更易回收，故往后建链表时均采用本版本方法
		for(int i=1;i<=len;i++){
			if(i==1){
				ch=new Chi(i);
				this.temp=ch;
				this.firstChi=ch;
			}else{
				if(i==len){
					ch=new Chi(i);
					temp.next=ch;
					this.temp=ch;
					temp.next=firstChi;
				}else{
					ch=new Chi(i);
					temp.next=ch;
					this.temp=ch;
				}
			}
		}
	}
	void visitLink(){
		Chi temp=firstChi;
		do{
			System.out.println(temp.num);
			temp=temp.next;
		}while(temp!=firstChi);
	}
}
	
	
	
	
	
	
	
	
	
	
	
