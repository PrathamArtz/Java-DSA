public class Basic {

    // stack =  LIFO data structure. Last-In First-Out|
    //          stores objects into a sort of “vertical tower"
    //          push() to add to the top
    //          pop() to remove from the top


    // uses of stacks?

// 1. undo/redo features in text editors
// 2. moving back/forward through browser history
// 3. backtracking algorithms (maze, file directories)
// 4. calling functions (call stack)


    // *************************************************************************
    // Queue = FIFO data structure. First-In First-Out (ex. A line of people)

    //          A collection designed for holding elements prior to processing Linear data structure.
    //          add = enqueue, offer(), add()
    //          remove = dequeue, poll()

    // Where are queues useful?

    // 1. Keyboard Buffer (letters should appear on the screen in the order they're pressed)
    // 2. Printer Queue (Print jobs should be completed in order)
    // 3. Used in LinkedLists, PriorityQueues, Breadth-first search

    // **************************************************************************

    //Priority Queue = A FIFO data structure that serves elements
    //                 with the highest priorities first
    //                 before elements with lower priority

//                      Insert = add(e), offer(e)

//                      Remove =  remove(), poll()

//                      Examine = element(), peek()


    // **************************************************************************
    // LinkedList =  Stores Nodes are in 2 parts (data + address)
    //               Nodes are in non-consecutive memory locations
    //               Elements are linked using pointers

//                                           Singly Linked List
//
//                             Node                Node                   Node
//                        [data | address] -> [data | address] -> [data | address]
//
//                                           Doubly Linked List
//
//                                    Node                            Node
//                        [address | data | address] <-> [address | data | address]


    //    advantages?
    //    1. Dynamic Data Structure (allocates needed memory while running)
    //    2. Insertion and Deletion of Nodes is easy. O(1)
    //    3. No/Low memory waste

    //    disadvantages?
    //    1. Greater memory usage (additional pointer)
    //    2. No random access of elements (no index [i])
    //    3. Accessing/searching elements is more time consuming. O(n)

    //    uses?
    //    1. implement Stacks/Queues
    //    2. GPS navigation
    //    3. music playlist
    // *******************************************************************************
}
