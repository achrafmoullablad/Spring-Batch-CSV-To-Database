package ma.isga.springbatch.writer;

import java.util.List;
import org.springframework.batch.item.ItemWriter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import ma.isga.springbatch.entities.User;
import ma.isga.springbatch.repository.UserRepository;

@Component
public class DBWriter implements ItemWriter<User>{
	@Autowired
	private UserRepository userRepository;
	
	@Override
	public void write(List<? extends User> users) throws Exception {
		userRepository.saveAll(users);
	}

}
