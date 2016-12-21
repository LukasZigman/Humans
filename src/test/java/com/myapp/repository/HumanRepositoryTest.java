package com.myapp.repository;

import com.myapp.DomainTest;
import com.myapp.domain.Human;
import org.assertj.core.api.Assertions;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Date;
import java.util.List;

import static org.assertj.core.api.Assertions.*;


public class HumanRepositoryTest extends DomainTest {

    @Autowired
    private HumanRepository humanRepository;

    @Test
    public void check_if_save_human_works() throws Exception {
        Human human = getHuman();

        Human save = humanRepository.save(human);

        List<Human> all = humanRepository.findAll();
        assertThat(all.size()).isEqualTo(1);
    }

    private Human getHuman() {
        Human human = new Human();
        human.setDateOfBirth(new Date());
        human.setFirstName("Test");
        human.setLastName("Test2");
        return human;
    }

    @Test
    public void check_if_get_human_works() throws Exception {
        Human human = getHuman();

        Human save = humanRepository.save(human);

        Long id = save.getId();
        Human one = humanRepository.findOne(id);

        assertThat(one.getDateOfBirth()).isEqualTo(save.getDateOfBirth());

    }

    @Test
    public void check_if_delete_human_works() throws Exception {
        Human human = getHuman();

        humanRepository.deleteAll();

        List<Human> all = humanRepository.findAll();
        assertThat(all.size()).isEqualTo(0);
    }
}
