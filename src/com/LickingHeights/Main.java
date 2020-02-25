package com.LickingHeights;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // Phase 1
        String place;
        String userFriend;
        String userFavoriteFood;
        String store;
        String accessory;
        String name;
        String clothing;
        String exclamation;
        String event;
        String activity;
        String song;
        String verb;
        String Adjective;
        String car;
        String number;
        String bodyPart;
        String adjective;
        String fear;
        String hobby;
        String secondVerb;
        String strangePhrase;


        // Phase 2

        Scanner keyboard;
        keyboard = new Scanner (System.in);

        System.out.println("name a place you frequent.");
        place = keyboard.nextLine();

        System.out.println("Insert a friends name, if you don't have a friend, make one up.");
        userFriend = keyboard.nextLine();

        System.out.println("Favorite Food");
        userFavoriteFood = keyboard.nextLine();

        System.out.println("A store you shop at often.");
        store = keyboard.nextLine();

        System.out.println("An accessory.");
        accessory = keyboard.nextLine();

        System.out.println("I forgot to ask, what's your name?");
        name = keyboard.nextLine();

        System.out.println("something you wear");
        clothing = keyboard.nextLine();

        System.out.println("a exclamation.");
        exclamation = keyboard.nextLine();

        System.out.println("an event you would attend.");
        event = keyboard.nextLine();

        System.out.println("Something you like to do.");
        activity = keyboard.nextLine();

        System.out.println("A popular song.");
        song = keyboard.nextLine();

        System.out.println("a verb ending in -ing");
        verb = keyboard.nextLine();

        System.out.println("an adjective");
        Adjective = keyboard.nextLine();

        System.out.println("your dream car");
        car = keyboard.nextLine();

        System.out.println("random number");
        number = keyboard.nextLine();

        System.out.println("plural body part.");
        bodyPart = keyboard.nextLine();

        System.out.println("an adjective");
        adjective = keyboard.nextLine();

        System.out.println("Something that spooks you");
        fear = keyboard.nextLine();

        System.out.println("A hobby");
        hobby = keyboard.nextLine();

        System.out.println("a second verb");
        secondVerb = keyboard.nextLine();

        System.out.println("an phrase you use to express enjoyment.");
        strangePhrase = keyboard.nextLine();


        // Phase 3
        System.out.println("One of my favorite things to do is meet up with "+userFriend);
        System.out.println("Especially when we go to "+Adjective+" "+place+" and get our favorite food, "+userFavoriteFood+".");
        System.out.println("One of the reasons I enjoy this snack is because it is extremely "+adjective);
        System.out.print(" and I find that "+exclamation+".");
        System.out.println("Normally, after we eat, we head to "+store+" and get some "+accessory+" and "+clothing+".");
        System.out.println("We only really go shopping if "+activity+" were to be coming up.");
        System.out.print("but this time, we were shopping for "+event+".");
        System.out.println("I normally don't go to events like this to due my fear of "+fear);
        System.out.print("But,"+userFriend+" can be quite persuasive.");
        System.out.println("As "+hobby+" isn't my strong suit");
        System.out.print("it took quite a bit of convincing.");
        System.out.println("Luckily enough, our "+verb+" didn't take too long, and I was soon able to go" +place+ ".");
        System.out.println("On the ride home, in "+userFriend+" "+car+", ");
        System.out.print("we belted out whatever happened to be on the radio, which happened to be "+song+".");
        System.out.println("Needless to say, we had singing and flailing our "+bodyPart+" uncontrollably.");
        System.out.println("After we spent what felt like "+number+" hours, we both felt like a "+secondVerb+" was in order.");
        System.out.println("all in all, this day was "+strangePhrase+" and I can't wait till a similar one.");
        System.out.println("                                     - "+name);



    }
}
