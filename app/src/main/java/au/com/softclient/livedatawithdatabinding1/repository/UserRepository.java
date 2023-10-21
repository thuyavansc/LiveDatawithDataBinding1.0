package au.com.softclient.livedatawithdatabinding1.repository;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;

import au.com.softclient.livedatawithdatabinding1.databinding.ActivityMainBinding;
//import au.com.softclient.livedatawithdatabinding1.models.User;

public class UserRepository {
    private MutableLiveData<String> repoMessage = new MutableLiveData<>();

    public void UserRepository() {
        repoMessage.setValue("This is Empty");
    }

    public LiveData<String> getRepoMessage() {
        return repoMessage;
    }

    public void setRepoMessage(String str) {
        repoMessage.setValue(str);
    }

}
/*
------Draft--------

public class UserRepository {
    private MutableLiveData<String> repoMessage = new MutableLiveData<>();

    public LiveData<String> getRepoMessage() {
        return userData;
    }

    public void fetchUser() {
        // In a real app, fetch user data from a database, API, or other source.
        User user = new User("Updated Name 1", "updated1@example.com");// Fetch user data.
        userData.postValue(user); // Update the LiveData with the new data.
    }

    public void fetchUserB(){
        User user = new User("Updated Name 2", "updated2@example.com");// Fetch user data.
        userData.postValue(user); // Update the LiveData with the new data.
    }

    public void fetchUserFromLayout(ActivityMainBinding binding) {
        // Retrieve user data from the layout
        //input1
        //String updatedName = binding.userNameTextView2.getText().toString();
        String updatedName = binding.input1.getText().toString();
        String updatedEmail = binding.userEmailTextView2.getText().toString();

        // Create a User object with the retrieved data
        User user = new User(updatedName, updatedEmail);

        userData.postValue(user);
    }

}


 */

/*
public class UserRepository {
    private MutableLiveData<User> userData = new MutableLiveData<>();

    public LiveData<User> getUserData() {
        return userData;
    }

    public void simulateDataChange() {
        // Simulate changes in user data
        User updatedUser = new User("Updated Name", "updated@example.com");
        userData.postValue(updatedUser); // Update the LiveData with the new data.
    }
}
*/

/*

public class UserRepository {
    private MutableLiveData<User> userData = new MutableLiveData<>();
    private UserService userService;

    public UserRepository(UserService userService) {
        this.userService = userService;
    }

    public LiveData<User> getUserData() {
        return userData;
    }

    public void fetchUser() {
        // In a real app, fetch user data from a database, API, or other source.
        //User user = // Fetch user data.
        User user =new User("John Doe ", "johndoe@example.com");
        userData.postValue(user); // Update the LiveData with the new data.



    }
}
*/
