package au.com.softclient.livedatawithdatabinding1.viewmodels;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import au.com.softclient.livedatawithdatabinding1.databinding.ActivityMainBinding;
//import au.com.softclient.livedatawithdatabinding1.models.User;
import au.com.softclient.livedatawithdatabinding1.repository.UserRepository;

public class UserViewModel extends ViewModel {
    //private MutableLiveData<String> message = new MutableLiveData<>();
    private LiveData<String> message;
    private UserRepository userRepository;
    public UserViewModel() {
        userRepository = new UserRepository();
        message = userRepository.getRepoMessage();
        //message.setValue(userRepository.getRepoMessage());
    }
    public void setMessage(String textVal){
        userRepository.setRepoMessage(textVal);
    }
    public LiveData<String> getMessage(){
        return userRepository.getRepoMessage();
    }

}

/*
----------Draft--------

public class UserViewModel extends ViewModel {
    private UserRepository userRepository;
    private LiveData<User> userData;

    public UserViewModel() {
        userRepository = new UserRepository();
        userData = userRepository.getUserData();
    }

    public LiveData<User> getUserData() {
        return userData;
    }

    public void fetchUser() {
        userRepository.fetchUser();
    }

    public void fetchUserB() {
        userRepository.fetchUserB();
    }

    public void fetchUserFromLayout(ActivityMainBinding binding) {
        userRepository.fetchUserFromLayout(binding);
    }

}


*/
/*
public class UserViewModel extends ViewModel {
    private UserRepository userRepository;
    private LiveData<User> userData;

    public UserViewModel() {
        //--------------------------------------------
        //userRepository = new UserRepository();
        //userData = userRepository.getUserData();
    }

    public LiveData<User> getUserData() {
        return userData;
    }

    public void fetchUser() {
        userRepository.fetchUser();
    }
    /*
    private MutableLiveData<User> userData = new MutableLiveData<>();

    public LiveData<User> getUserData() {
        return userData;
    }

    public void fetchUser() {
        // In a real app, fetch user data here, but for this example, we'll simulate it
        User user = new User("John Doe", "johndoe@example.com");
        userData.setValue(user);
    }


}
*/