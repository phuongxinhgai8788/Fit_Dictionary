package vn.edu.hanu.fitdictionary.data;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.ViewModel;

import java.util.Collection;
import java.util.List;

public class UserViewModel extends ViewModel {

    private FetchUser fetchUser = FetchUser.get();

    public UserViewModel(){
    }

//    public LiveData<User> fetchUserByID(int id){
//        return fetchUser.fetchUserByID(id);
//    }

//    public LiveData<List<User>> fetchUsers(){
//        return fetchUser.fetchUsers();
//    }

    public LiveData<User> updateUser(int id, User user) {
        return fetchUser.updateProfile(id, user);
    }

    public LiveData<Max> getLastId() {
        return fetchUser.fetchMaxId();
    }

    public LiveData<List<User>> getUserByEmail(String email){
        return fetchUser.fetchUserByEmail(email);
    }

    public LiveData<User> saveUser(User savedUser) {
        return fetchUser.register(savedUser);
    }

    @Override
    protected void onCleared() {
        super.onCleared();
    }

}
