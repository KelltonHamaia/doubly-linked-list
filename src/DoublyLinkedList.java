public class DoublyLinkedList {
    Node head;
    Node tail;
    Node next;
    Node prev;
    int size = 0;

    public void add (Node node) {
        if(this.size() == 0) {
            this.head = node;
            this.tail = node;
            this.size++;
        } else if(this.size() == 1){
            this.tail = node;
            this.tail.next = null;
            this.tail.prev = this.head;
            this.head.next = this.tail;
            this.size++;
        } else if(this.size() > 1) {
            this.tail.next = node;
            node.next = null;
            node.prev = this.tail;
            this.tail = node;
            this.size++;
        }
    }

    public void addFirst(Node node) {
        if(this.head == null) {
            this.head = node;
            this.tail = node;
            this.size++;
        } else if(this.head != null) {
            node.next = this.head;
            this.head.prev = node;
            this.head = node;
            this.head.prev = null;
            this.size++;
        }
    }

    public void addlast(Node node) {
        if(this.tail == null) {
            this.head = node;
            this.tail = node;
            this.size++;
        } else if(this.tail != null) {
            this.tail.next = node;
            node.prev = this.tail;
            this.tail = node;
            this.tail.next = null;
            size++;
        }
    }

    public void addAfter(String target, Node node) {
        Node list = this.head;

        while(list != null) {
            if(list.data == target) {
                System.out.println("achei o "+ target);
                if(list.next == null) {
                    addlast(node);
                    return;
                } else {
                   node.next = list.next;
                   list.next.prev = node;
                   list.next = node;
                   node.prev = list; 
                   this.size++;
                   return;
                }
            } else {
                list = list.next;
            }
        }
        System.out.println("Não foi possível adicionar o valor.");
    }


    public void removeFirst() {
        if(this.size() <= 0) {
            System.out.println("A lista está vazia.");
            return;
        }

        if(this.size() == 1 && this.head.data == this.tail.data) {
            this.head = null;
            this.tail = null;
            this.size = 0;
            return;
        }

        if(this.size() == 2 && this.head.next == this.tail) {
            this.head = this.tail;
            this.head.next = null;
            this.tail.prev = null;
            this.size--;
            return;
        }

        if(this.head.next != this.tail) {
            this.head = this.head.next;
            this.head.prev = null;
            this.size--;
        }

    }
    
    public void removeLast() {
        if(this.size() <= 0 ) {
            System.out.println("Lista vazia.");
            return;
        }

        if(this.size() == 1 && this.head.data == this.tail.data) {
            this.head = null;
            this.tail = null;
            this.size = 0;
            return;
        } 

        if(this.size() == 2 && this.tail.prev == this.head) {
            this.tail = this.head;
            this.head.next = null;
            this.tail.prev = null;
            this.size--;
            return;
        }

        if(this.tail.prev != this.head) {
            this.tail = this.tail.prev;
            this.tail.next = null;
            this.size--;
        }
    }

    public void remove(Node target) {
        if(this.size() <= 0) {
            System.out.println("Lista vazia.");
            return;
        }

        if(this.head == target) {
            removeFirst();
            return;
        } 

        if(this.tail == target) {
            removeLast();
            return;
        }

        Node list = this.head;
        while(list != null) {
            if(list == target) {
                if(target.prev != null && target.next != null) {
                    target.prev.next = target.next;
                    target.next.prev = target.prev;
                    size--;
                    return;
                }
            } else {
                list = list.next;
            }
        }

    }

    public void removeByData(String data) {
        if(this.size() <= 0) {
            System.out.println("Lista vazia.");
            return;
        }

        if(this.head.data == data) {
            removeFirst();
            return;
        } 

        if(this.tail.data == data) {
            removeLast();
            return;
        }

        Node list = this.head;
        while(list != null) {
            if(list.data == data) {
                if(list.prev != null && list.next != null) {
                    list.prev.next = list.next;
                    list.next.prev = list.prev;
                    size--;
                    return;
                }
            } else {
                list = list.next;
            }
        }

    }

    public int size(){
        return this.size;
    }

    public void showListInOrder () {
        Node list = this.head;
        if(list == null) {
            System.out.println("Lista vazia");
            return;
        }

        if(list.next == null) {
            System.out.println(list.data);
            return;
        } 

        while(list.data != null) {
            if(list.next != null) {
                System.out.println(list.data);
                list = list.next;
            } else {
                System.out.println(list.data);
                return;
            }
        }

    }

    public void showListInOrderReverse () {
        Node list = this.tail;
        if(list == null) {
            System.out.println("Lista vazia");
            return;
        }

        if(list.prev == null) {
            System.out.println(list.data);
        } 

        while(list.prev != null) {
            if(list.prev != null) {
                System.out.println(list.data);
                list = list.prev;
            } else {
                System.out.println(list.data);
                return;
            }
        }
        System.out.println(list.data);

    }

    public void showHead () {
        System.out.println(this.head != null ? "HEAD: "+ this.head.data : "Sem head");
    }

    public void showTail () {
        System.out.println(this.tail != null ? "TAIL: "+ this.tail.data : "Sem tail");

    }

    public boolean isEmpty() {
        return this.size() <= 0 ? true : false;
    }

    public boolean search(String data) {
        Node list = this.head;
        boolean status = false;
        while(list.next != null) {
            if(list.data == data) {
                status = true;
                return status;
            } else {
                list = list.next;
            }
        }
        if(list.data == data) {
            status = true;
            return status;
        }
        return status;
    }
}