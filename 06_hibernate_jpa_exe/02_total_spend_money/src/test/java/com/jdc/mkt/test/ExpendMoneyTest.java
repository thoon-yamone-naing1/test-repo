package com.jdc.mkt.test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.time.LocalDate;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import com.jdc.mkt.entity.ExpendInfo;
import com.jdc.mkt.entity.IncomesInfo;
import com.jdc.mkt.entity.IncomesInfo.IncomesType;
import com.jdc.mkt.entity.Item;
import com.jdc.mkt.utils.JpaFactory;

public class ExpendMoneyTest extends JpaFactory
{
	@Test
	@Disabled
	void selectTest()
	{
		var em = emf.createEntityManager();
		
		
		var i = em.find(Item.class, 1);
				
		assertNotNull(i);
		assertTrue(em.contains(i));
		assertEquals("Book", i.getName());
	}
	
	@Test
	void persistTest()
	{
		var em = emf.createEntityManager();
		
		// To Be Transient State
		var item = new Item();
		item.setName("Book");
		item.setPrice("5000");
		item.setQty(5);
		item.setTotal(5);
		
		var expend = new ExpendInfo();
		expend.setId(1);
		expend.setDate(LocalDate.now());
		expend.setDescription("For Reading");
		
		var incomes = new IncomesInfo();
		incomes.setDate(LocalDate.now());
		incomes.setIncomeType(IncomesType.salary);
		incomes.setDescription("For January");
		
		em.getTransaction().begin();
		
		// To Be Manage State
		em.persist(item);
		em.persist(expend);
		em.persist(incomes);
		
		em.getTransaction().commit();
		
		
		
		
		
		
	}

}
