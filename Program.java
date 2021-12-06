package com.itp.final2020;

import java.util.Collection;
import java.util.LinkedList;
import java.util.Scanner;

public class Program {

    public void initializeMember() {
        Scanner scan = new Scanner(System.in);

        Collection<UniversityMember> members = new LinkedList<>();

        members.add(new Professor("Tormasov", 35, Sex.MALE));
        members.add(new Student("Grisha", 17, Sex.FEMALE));

        displayMembers(members);
    }

    public void displayMembers(Collection<UniversityMember> members) {
        for (UniversityMember member : members) {
            System.out.println(member);
        }
    }

    public static void main(String[] args) {
        Container<UniversityMember>[] containers = new Container[2];
        containers[0] = new Container<>(new Professor("Tormasov", 35, Sex.MALE));
        containers[1] = new Container<>(new Student("Grisha", 17, Sex.FEMALE));

        for (Container<UniversityMember> container : containers) {
            System.out.println(container);
        }

        try {
            for (int i = 0; i < 3; i++) {
                System.out.println(containers[i]);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
