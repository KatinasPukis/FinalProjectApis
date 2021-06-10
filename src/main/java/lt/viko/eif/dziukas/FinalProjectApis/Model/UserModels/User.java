package lt.viko.eif.dziukas.FinalProjectApis.Model.UserModels;

import java.util.Date;

/**
 * Represents User object that has
 * all the important information associated with the user:
 * name, surname, email, birthdate.
 *
 * @author Dainoras Ziukas, Valdemar Subotkovski, Dominykas Pleteras
 * @version 1.0
 * @since 1.0
 */

public class User {
    private String name;
    private String surname;
    private String email;
    private Date birthdate;

    /**
     * User constructor.
     *
     * @param name of the user.
     * @param surname of the user.
     * @param email of the user.
     * @param birthdate of the user.
     */
    public User(String name, String surname, String email, Date birthdate) {
        this.name = name;
        this.surname = surname;
        this.email = email;
        this.birthdate = birthdate;
    }

    /**
     * Gets users name
     *
     * @return user name.
     */
    public String getName() {
        return name;
    }

    /**
     * Sets users name.
     *
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Gets users surname.
     *
     * @return users surname.
     */
    public String getSurname() {
        return surname;
    }

    /**
     * Sets users surname.
     *
     * @param surname of the user.
     */
    public void setSurname(String surname) {
        this.surname = surname;
    }

    /**
     * Gets users email.
     *
     * @return email of the user.
     */
    public String getEmail() {
        return email;
    }

    /**
     * Sets users email.
     *
     * @param email of the user.
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * Gets users birthdate
     *
     * @return users birthdate.
     */
    public Date getBirthdate() {
        return birthdate;
    }

    /**
     * Sets users birthdate.
     *
     * @param birthdate of the user.
     */
    public void setBirthdate(Date birthdate) {
        this.birthdate = birthdate;
    }


}
