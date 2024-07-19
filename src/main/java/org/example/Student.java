package org.example;

import javax.persistence.*;

@Entity
@Table(name = "student_tab")
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    private String name;
    private String desg;

    private Certificate certi;

    public Certificate getCerti() {
        return certi;
    }

    public void setCerti(Certificate certi) {
        this.certi = certi;
    }

/*
    @Lob
    private byte[] image;

*/

    public Student(){

    }

    public Student(Integer id, String name, String desg) {
        this.id = id;
        this.name = name;
        this.desg = desg;
        /*this.image= image;*/
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDesg() {
        return desg;
    }

    public void setDesg(String desg) {
        this.desg = desg;
    }

   /* public byte[] getImage() {
        return image;
    }*/

   /* public void setImage(byte[] image) {
        this.image = image;
    }
*/
    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", desg='" + desg + '\'' +
                /*", image=" + Arrays.toString(image) +*/
                '}';
    }
}
