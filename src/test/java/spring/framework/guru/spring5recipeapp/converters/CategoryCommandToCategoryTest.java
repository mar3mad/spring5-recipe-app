package spring.framework.guru.spring5recipeapp.converters;

import org.junit.jupiter.api.*;
import spring.framework.guru.spring5recipeapp.commands.*;
import spring.framework.guru.spring5recipeapp.domain.*;

import static org.junit.jupiter.api.Assertions.*;

public class CategoryCommandToCategoryTest {
    public static final Long ID_VALUE = 1L;
    public static final String DESCRIPTION = "description";

    CategoryCommandToCategory converter;

    @BeforeEach
    public void setUp(){
        converter = new CategoryCommandToCategory();
    }

    @Test
    public void testNullObject() {
        assertNull(converter.convert(null));
    }

    @Test
    public void testEmptyObject() {
        assertNotNull(converter.convert(new CategoryCommand()));
    }

    @Test
    public void convert(){
        CategoryCommand categoryCommand = new CategoryCommand();
        categoryCommand.setId(ID_VALUE);
        categoryCommand.setDescription(DESCRIPTION);

        Category category = converter.convert(categoryCommand);

        assertEquals(ID_VALUE, category.getId());
        assertEquals(DESCRIPTION, category.getDescription());
    }
}
