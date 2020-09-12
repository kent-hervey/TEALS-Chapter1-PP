package com.hervey.app;

public class LadySwallowedFly {

	static String absurdBird = "How absurd to swallow a bird!";
	static String howCow = "I don't know how she swallowed a cow!";
	static String imagineCat = "Imagine that! She swallowed a cat!";
	static String throatGoat = "She just opened her throat and swallowed a goat!";
	static String birdSpider = "She swallowed the bird to catch the spider;";
	static String catBird = "She swallowed the cat to catch the bird,";
	static String cowGoat = "She swallowed the cow to catch the goat,";
	static String dogCat = "She swallowed the dog to catch the cat,";
	static String goatDog = "She swallowed the goat to catch the dog,";
	static String spiderFly = "She swallowed the spider to catch the fly;";
	static String wriggled = "That wriggled and jiggled and tickled inside her!";
	static String hogDog = "What a hog, to swallow a dog!";
	static String ladySwallowed = "There was an old lady who swallowed a";
	static String dontFly = "I don't know why she swallowed a fly - ";
	static String think = "I think she'll die!";
	static String perhaps = "Perhaps she'll die!";

	public static void main(String[] args) {
		// System.out.println(absurdBird);

		produceOutputLyrics();

	}

	private static void produceOutputLyrics() {

		produceLadySwallowedAnimal("fly");
		produceDontFlyThink();
		produceLadySwallowedAnimal("spider");
		produceWriggled();
		produceStanzaSpacer();

		produceSpiderFly();
		produceDontFlyPerhaps();
		produceLadySwallowedAnimal("bird");
		produceAbsurdBirdd();
		produceStanzaSpacer();

		produceBirdSpider();
		produceWriggled();
		produceSpiderFly();
		produceDontFlyThink();
		produceLadySwallowedAnimal("cat");
		produceImagineCat();
		produceStanzaSpacer();

		produceCatBird();
		produceBirdSpider();
		produceWriggled();
		produceSpiderFly();
		produceDontFlyThink();
		produceLadySwallowedAnimal("dog");
		produceHogDog();
		produceStanzaSpacer();

		produceDogCat();
		produceCatBird();
		produceBirdSpider();
		produceWriggled();
		produceSpiderFly();
		produceDontFlyThink();
		produceLadySwallowedAnimal("goat");
		produceThroatGoat();
		produceStanzaSpacer();

		produceGoatDog();
		produceDogCat();
		produceCatBird();
		produceBirdSpider();
		produceWriggled();
		produceSpiderFly();
		produceDontFlyThink();
		produceLadySwallowedAnimal("cow");
		produceHowCow();
		produceStanzaSpacer();

		produceCowGoat();
		produceGoatDog();
		produceDogCat();
		produceCatBird();
		produceBirdSpider();
		produceWriggled();
		produceSpiderFly();
		produceDontFlyThink();
		produceLadySwallowedAnimal("horse");
		produceStanzaSpacer();

		System.out.println("...She died, of course!");

	}

	private static void produceGoatDog() {
		System.out.println(goatDog);

	}

	private static void produceCowGoat() {
		System.out.println(cowGoat);

	}

	private static void produceHowCow() {
		System.out.println(howCow);

	}

	private static void produceThroatGoat() {
		System.out.println(throatGoat);

	}

	private static void produceDogCat() {
		System.out.println(dogCat);

	}

	private static void produceHogDog() {
		System.out.println(hogDog);

	}

	private static void produceCatBird() {
		System.out.println(catBird);

	}

	private static void produceImagineCat() {
		System.out.println(imagineCat);

	}

	private static void produceBirdSpider() {
		System.out.println(birdSpider);

	}

	private static void produceAbsurdBirdd() {
		System.out.println(absurdBird);

	}

	private static void produceLadySwallwedBird() {
		// TODO Auto-generated method stub

	}

	private static void produceDontFlyPerhaps() {
		String dontFlyPerhaps = dontFly + perhaps;
		System.out.println(dontFlyPerhaps);

	}

	private static void produceSpiderFly() {
		System.out.println(spiderFly);

	}

	private static void produceStanzaSpacer() {
		System.out.println();

	}

	private static void produceWriggled() {
		System.out.println(wriggled);

	}

	private static void produceLadySwallowedAnimal(String animal) {
		String ladySwallowedFly = ladySwallowed + " " + animal + ";";
		System.out.println(ladySwallowedFly);

	}

	private static void produceDontFlyThink() {
		String dontFlyThink = dontFly + think;
		System.out.println(dontFlyThink);

	}

}
