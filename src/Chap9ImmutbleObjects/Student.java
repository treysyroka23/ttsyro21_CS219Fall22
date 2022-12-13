package Chap9ImmutbleObjects;

public class Student {
    // classes encapsulate related data

 // these are instance variable
     private String first;
     private String last;
     private String id;

      private String nickname;
     // immutable class
     public Student(String first_, String last_, String id_, String nickname_) {
      first = first_;
      last = last_;
      id = id_;
      nickname = nickname_;
     }
    public String toString() {
        return last + ", " + first + "(" + nickname + ")" + " " + id;
    }

}
