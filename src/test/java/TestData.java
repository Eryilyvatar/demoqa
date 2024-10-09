import com.github.javafaker.Faker;
import utils.RandomUtils;

import java.util.Locale;

public class TestData {

    Faker faker = new Faker(new Locale("it"));

    String firstName = faker.name().firstName(),
            lastName = faker.name().lastName(),
            userEmail = faker.internet().emailAddress(),
            userGender = RandomUtils.getRandomValue("Male", "Female", "Other"),
            userNumber = faker.number().numberBetween(1000000000L, 9999999999L) + "",
            monthBirthUser = RandomUtils.randomMonth(),
            yearBirthUser = faker.number().numberBetween(1940, 2005) + "",
            dayBirthUser = RandomUtils.randomInt(1, 28),
            userSubjects = RandomUtils.getRandomValue("English", "Arts", "History", "Hindi"),
            hobbie1 = "Sports",
            hobbie2 = "Reading",
            hobbie3 = "Music",
            pictureUrl = "my_nero_picture.jpg",
            userAddress = faker.address().fullAddress(),
            userState = RandomUtils.getRandomValue("NCR", "Uttar Pradesh", "Haryana", "Rajasthan"),
            userCity = RandomUtils.getCityData(userState);
}
