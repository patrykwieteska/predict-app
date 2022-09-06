package pl.pw.predict.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pl.pw.predict.app.model.UserData;

@Repository
public interface UserDataRepository extends JpaRepository<UserData,Integer> {


}
