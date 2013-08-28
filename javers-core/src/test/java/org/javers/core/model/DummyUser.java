package org.javers.core.model;

import javax.persistence.Id;
import javax.persistence.Transient;
import java.util.List;
import java.util.Set;

/**
 * @author bartosz walacik
 */
public class DummyUser extends AbstractDummyUser {
    public enum Sex {FEMALE, MALE, OCCASIONALLY}

    private transient int someTransientField;

    //primitives and primitive boxes
    private boolean flag;
    private Boolean bigFlag;
    private int age;

    //enum
    private Sex sex;

    @Id
    private String name;
    private Integer largeInt;

    //collections
    private Set<String> stringSet;
    private List<Integer> integerList;

    //arrays
    private int[] intArray;

    //value object
   // private DummyAddress primaryAddress;

    //reference
    private DummyUser supervisor;

    public DummyUser() {
    }

    public DummyUser(String name) {
        this.name = name;
    }

    @Transient
    public int getSomeTransientField() {
        return someTransientField;
    }

    public DummyUser getSupervisor() {
        return supervisor;
    }

    public void setSupervisor(DummyUser supervisor) {
        this.supervisor = supervisor;
    }

    public Boolean getBigFlag() {
        return bigFlag;
    }

    public void setBigFlag(Boolean bigFlag) {
        this.bigFlag = bigFlag;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Id
    public String getName() {
        return name;
    }

    public Sex getSex() {
        return sex;
    }

    public void setSex(Sex sex) {
        this.sex = sex;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isFlag() {
        return flag;
    }

    public void setFlag(boolean flag) {
        this.flag = flag;
    }

    public Integer getLargeInt() {
        return largeInt;
    }

    public void setLargeInt(Integer largeInt) {
        this.largeInt = largeInt;
    }

    public Set<String> getStringSet() {
        return stringSet;
    }

    public void setStringSet(Set<String> stringSet) {
        this.stringSet = stringSet;
    }

    public List<Integer> getIntegerList() {
        return integerList;
    }

    public void setIntegerList(List<Integer> integerList) {
        this.integerList = integerList;
    }

    public int[] getIntArray() {
        return intArray;
    }

    public void setIntArray(int[] intArray) {
        this.intArray = intArray;
    }

    public void setSomeTransientField(int someTransientField) {
        this.someTransientField = someTransientField;
    }
}