package au.com.softclient.livedatawithdatabinding1.viewmodels;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import au.com.softclient.livedatawithdatabinding1.repository.UserRepository;

public class FirstFragViewModel extends ViewModel {

    //private MutableLiveData<String> message = new MutableLiveData<>();
    private LiveData<String> message;
    private UserRepository userRepository;
    public FirstFragViewModel() {
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

    /*
    private MutableLiveData<String> message = new MutableLiveData<>();
    public FirstFragViewModel() {
        message.setValue("Constructor Initial");
    }
    public void setMessage(String textVal){
        message.setValue(textVal);
    }
    public LiveData<String> getMessage(){
        return message;
    }
    */

}
