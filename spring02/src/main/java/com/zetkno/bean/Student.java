package com.zetkno.bean;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class Student {
    private String name;
    private Address addr;
    private String[] books;
    private List<String> hobbies;
    private Map<String, String> cards;
    private Set<String> games;
    private String wife;
    private Properties info;

    public void setInfo(Properties info) {
        this.info = info;
    }

    public void setWife(String wife) {
        this.wife = wife;
    }

    public void setGames(Set<String> games) {
        this.games = games;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAddr(Address addr) {
        this.addr = addr;
    }

    public String[] getBooks() {
        return books;
    }

    public void setBooks(String[] books) {
        this.books = books;
    }

    public void setHobbies(List<String> hobbies) {
        this.hobbies = hobbies;
    }

    public void setCards(Map<String, String> cards) {
        this.cards = cards;
    }

    public void show() {
        System.out.println("name=" + name + ",address=" + addr.getAddress());
        System.out.print("books=");
        for (int i = 0; i < books.length; i++) {
            System.out.print(books[i] + "  ");
        }
        System.out.println();
        System.out.println("hobbies=" + hobbies);
        System.out.println("cards= " + cards);
        System.out.println("喜欢的游戏= " + games);
        System.out.println("wife= " + wife);
        System.out.println("info= " + info);
    }
}

