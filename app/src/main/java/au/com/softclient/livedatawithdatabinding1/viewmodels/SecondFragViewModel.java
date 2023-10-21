package au.com.softclient.livedatawithdatabinding1.viewmodels;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.ViewModel;

import au.com.softclient.livedatawithdatabinding1.repository.UserRepository;

public class SecondFragViewModel extends ViewModel {
    //private MutableLiveData<String> message = new MutableLiveData<>();
    private LiveData<String> message;
    private UserRepository userRepository;
    public SecondFragViewModel() {
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
