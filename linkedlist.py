class Node:
    def __init__(self, data):
        self.data = data
        self.next = None

class LinkedList:
    def __init__(self):
        self.head = None

    def append(self, data):
        """Adds an element to the end of the list."""
        new_node = Node(data)
        if self.head is None:
            self.head = new_node
        else:
            current = self.head
            while current.next:
                current = current.next
            current.next = new_node

    def insert_at_beginning(self, data):
      """Adds an element to the beginning of the list"""
      new_node = Node(data)
      new_node.next = self.head
      self.head = new_node

    def delete(self, data):
        """Deletes the first occurrence of a given value."""
        if self.head is None:
            return

        if self.head.data == data:
            self.head = self.head.next
            return

        current = self.head
        while current.next:
            if current.next.data == data:
                current.next = current.next.next
                return
            current = current.next

    def print_list(self):
        """Prints the list elements."""
        current = self.head
        while current:
            print(current.data, end=" ")
            current = current.next
        print()
# Create a linked list
my_list = LinkedList()

# Add elements
my_list.append(1)
my_list.append(2)
my_list.append(3)

my_list.insert_at_beginning(0)

# Print the list
print("Original List:")
my_list.print_list()

# Delete an element
my_list.delete(2)

# Print the updated list
print("Updated List:")
my_list.print_list()