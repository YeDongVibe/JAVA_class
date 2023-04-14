package Chapter8;

class Linkedlist {
	static class Node {
		String data;
		Node link;

		Node(String data) {
			this.data = data;
			link = null;
		}
		public String toString() {
			return "data =" + data;
		}
	}

	Node head;
	void show() {
		Node p = head;
		while (p != null) {
			System.out.println(p.toString());
			p = p.link;
		}
	}

	void add(String name) {
		Node temp = new Node(name);
		if (head == null) {
			head = temp;
		} else {
			temp.link = head;
			head = temp;
		}
	}
}

public class Hong04_listoutterclass {
	public static void name(String[] args) {
		Linkedlist my = new Linkedlist();
		my.add("hong");
		my.add("kim");
		my.add("lee");
		my.add("park");
		my.add("choi");
		my.show();
	}

}