package task3_2.model;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Store {
    private String name = "MyStore";
    private ArrayList<Department> departments = new ArrayList<>();

    public Store(String name) {
        this.name = name;
    }

    public Store() { }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    private class Department{
        private String name;
        private String typeOfGoods;
        private String services;
        private String location;
        private ArrayList<Product> products = new ArrayList<>();

        Department(String name, String typeOfGoods, String services, String location) {
            this.name = name;
            this.typeOfGoods = typeOfGoods;
            this.services = services;
            this.location = location;
        }

        Department() { }


        void addProduct(String name, int amount, double price){
            products.add(new Product(name, amount, price));
        }

        boolean removeProduct(String name){
            boolean status = false;
            for (int i = 0; i < products.size(); i++) {
                if(products.get(i).getName().equals(name)){
                    products.remove(i);
                    status = true;
                }
            }
            return status;
        }

        @Override
        public String toString() {
            return "Department{" +
                    "name='" + name + '\'' +
                    ", typeOfGoods='" + typeOfGoods + '\'' +
                    ", services='" + services + '\'' +
                    ", location='" + location + '\'' +
                    ", products=" + products +
                    '}';
        }
    }

    public void addDepartment(String name, String typeOfGoods, String services, String location){
        departments.add(new Department(name, typeOfGoods, services, location));
    }

    public boolean removeDepartmentByName(String name){
        boolean status = false;
        for (int i = 0; i < departments.size(); i++) {
            if(departments.get(i).name.equals(name)){
                departments.remove(i);
                status = true;
            }
        }
        return status;
    }

    public void sortDepartmentsByName(){
        Collections.sort(departments, new Comparator<Department>() {
            @Override
            public int compare(Department o1, Department o2) {
                return o1.name.compareTo(o2.name);
            }
        });
    }

    public boolean deliveryOfGoods(String departmentName, String productName, int amount, double price){
        boolean status = false;
        for (int i = 0; i < departments.size(); i++) {
            if(departments.get(i).name.equals(departmentName)){
                departments.get(i).addProduct(productName, amount, price);
                status = true;
            }
        }
        return status;
    }

    public boolean liquidationOfGoods(String departmentName, String productName){
        boolean status = false;
        for (int i = 0; i < departments.size(); i++) {
            if(departments.get(i).name.equals(departmentName)){
                if(departments.get(i).removeProduct(productName)){
                    status = true;
                }
            }
        }
        return status;
    }

    @Override
    public String toString() {
        return "Store{" +
                "name = '" + name + '\'' +
                ", departments = " + departments +
                '}';
    }
}
