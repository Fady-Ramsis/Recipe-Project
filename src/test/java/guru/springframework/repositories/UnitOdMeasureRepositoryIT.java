package guru.springframework.repositories;

import guru.springframework.domain.UnitOfMeasure;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.annotation.DirtiesContext;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Optional;

import static org.junit.Assert.*;
@RunWith(SpringRunner.class)
@DataJpaTest
public class UnitOdMeasureRepositoryIT {
    @Autowired
    UnitOdMeasureRepository unitOdMeasureRepository;

    @Before
    public void setUp() throws Exception {
    }

    @Test
    @DirtiesContext
    public void findbyDescription() throws Exception {
        Optional<UnitOfMeasure>unitOfMeasureOptional=unitOdMeasureRepository.findbyDescription("fady");
        assertEquals("fady",unitOfMeasureOptional.get().getDescription());
    }
    @Test

    public void findbyDescriptionA() throws Exception {
        Optional<UnitOfMeasure>unitOfMeasureOptional=unitOdMeasureRepository.findbyDescription("Ano");
        assertEquals("Ano",unitOfMeasureOptional.get().getDescription());
    }
}