package utils;

import com.github.javafaker.Faker;

import java.security.SecureRandom;
import java.util.concurrent.ThreadLocalRandom;


public class RandomUtils {
    public static void main(String[] args) {
        System.out.println(randomString(10));
    }


    public static String randomString(int len){
        final String AB = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";
        SecureRandom rnd = new SecureRandom();
        StringBuilder sb = new StringBuilder(len);
        for(int i = 0; i < len; i++)
            sb.append(AB.charAt(rnd.nextInt(AB.length())));
        return sb.toString();
    }

    public static String randomEmail() {
        return randomString(10) + "@tut.by";
    }

    public static String randomInt(int min, int max) {
        int randomNum = ThreadLocalRandom.current().nextInt(min, max + 1);
        String numToReturn = randomNum + "";
        return numToReturn;
    }

    public static String randomMonth() {
        String[] values = {"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};
        int index = Integer.parseInt(randomInt(0 , values.length -1));
        return values[index];
    }

    public static String getRandomValue(String... initialValues) {
        Faker faker = new Faker();
        return faker.options().option(initialValues);
    }

    public static String getCityData(String state1) {
        String city = new String();
        Faker faker = new Faker();
        switch (state1) {
            case "NCR":
                city = faker.options().option("Delhi", "Gurgaon", "Noida");
                break;
            case "Uttar Pradesh":
                city = faker.options().option("Agra", "Lucknow", "Merrut");
                break;
            case "Haryana":
                city = faker.options().option("Karnal", "Panipat");
                break;
            case "Rajasthan":
                city = faker.options().option("Jaipur", "Jaiselmer");
                break;
            default:
        }
        return city;
    }
}
