import org.junit.jupiter.api.Test;


public class TestsWithDemoQAPage extends TestBase {


    @Test
    void formVerification() {

        registrationPage.openPage()
                .setFirstName(firstName)
                .setLastName(lastName)
                .setEmail(userEmail)
                .setGender(userGender)
                .setNumber(userNumber)
                .setBirthDate(dayBirthUser, monthBirthUser, yearBirthUser)
                .setUserSubjects(userSubjects)
                .setUserHobbie(hobbie1, hobbie2, hobbie3)
                .setUserPicture(pictureUrl)
                .setUserAddres(userAddress)
                .setUserState(userState)
                .setUserCity(userCity)
                .submitUserData()
                .verifyResultModalAppears()
                .verifyResultData("Student Name", firstName + " " + lastName)
                .verifyResultData("Student Email", userEmail)
                .verifyResultData("Gender", userGender)
                .verifyResultData("Mobile", userNumber)
                .verifyResultData("Date of Birth", dayBirthUser + " " + monthBirthUser + "," + yearBirthUser)
                .verifyResultData("Hobbies", hobbie1 + ", " + hobbie2 + ", " + hobbie3)
                .verifyResultData("Picture", pictureUrl)
                .verifyResultData("Address", userAddress)
                .verifyResultData("State and City", userState + " " + userCity);

    }
}
