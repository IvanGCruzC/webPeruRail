package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PassengerDataPage extends BasePage{
    @FindBy(id = "txt_nombre[suite][cab1][1]")
    private WebElement firstName;
    @FindBy(id = "txt_apellido[suite][cab1][1]")
    private WebElement lastName;
    @FindBy(id = "txt_fecha_nacimiento[suite][cab1][1]")
    private WebElement dateOfBirth;
    @FindBy(id = "sel_nacion[suite][cab1][1]")
    private WebElement nationality;
    @FindBy(id = "sel_tpdoc[suite][cab1][1]")
    private WebElement documentId;
    @FindBy(id = "txt_nroid[suite][cab1][1]")
    private WebElement documentNumber;
    @FindBy(id = "sel_sexo[suite][cab1][1]")
    private WebElement sex;
    @FindBy(id = "txt_telefono[suite][cab1][1]")
    private WebElement telephone;
    @FindBy(id = "txt_mail[suite][cab1][1]")
    private WebElement email;
    @FindBy(id = "txt_mail_conf[suite][cab1][1]")
    private WebElement emailConfirm;
    @FindBy(id = "btnContinuarPas")
    private WebElement continuar;

    public PassengerDataPage withFirstName(String firstName) {
        sendKeys(this.firstName, firstName);
        return this;
    }

    public PassengerDataPage withLastName(String lastName) {
        sendKeys(this.lastName, lastName);
        return this;
    }

    public PassengerDataPage withDateOfBirth() {
        click(dateOfBirth);
        return this;
    }

    public PassengerDataPage withNationality(String nationality) {
        selectOption(this.nationality, nationality);
        return this;
    }

    public PassengerDataPage withDocumentId(String documentId) {
        selectOption(this.documentId, documentId);
        return this;
    }

    public PassengerDataPage withDocumentNumber(String documentNumber) {
        sendKeys(this.documentNumber, documentNumber);
        return this;
    }

    public PassengerDataPage withSex(String sex) {
        selectOption(this.sex, sex);
        return this;
    }

    public PassengerDataPage withTelephone(String telephone) {
        sendKeys(this.telephone, telephone);
        return this;
    }

    public PassengerDataPage withEmail(String email) {
        sendKeys(this.email, email);
        return this;
    }

    public void withEmailConfirm(String emailConfirm) {
        sendKeys(this.emailConfirm, emailConfirm);
    }

    public void clickContinue() {
        scroll(continuar);
        click(continuar);
    }
}
