package ma.isga.springbatch.processor;

import java.util.Date;
import org.springframework.batch.item.ItemProcessor;
import org.springframework.stereotype.Component;

import ma.isga.springbatch.entities.User;

@Component
public class Processor implements ItemProcessor<User, User>{

	@Override
	public User process(User user) throws Exception {
		user.setTimestamp(new Date());
		return user;
	}

}
