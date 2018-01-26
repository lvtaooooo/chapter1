package org.smart4j.chapter1.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.smart4j.chapter1.helper.DatabaseHelper;
import org.smart4j.chapter1.model.Customer;

import java.util.List;
import java.util.Map;

public class CustomerService {

    private static final Logger LOGGER = LoggerFactory.getLogger(CustomerService.class);

//    public List<Customer> getCustomerList(String keyword) {
//////        Connection conn = null;
//////        try {
//////            List<Customer> customerList = new ArrayList<>();
//////            String sql = "SELECT * FROM customer";
//////            conn = DatabaseHelper.getConnection();
//////            PreparedStatement stmt = conn.prepareStatement(sql);
//////            ResultSet rs = stmt.executeQuery();
//////            while (rs.next()) {
//////                Customer customer = new Customer();
//////                customer.setId(rs.getLong("id"));
//////                customer.setName(rs.getString("name"));
//////                customer.setContact(rs.getString("contact"));
//////                customer.setTelephone(rs.getString("telephone"));
//////                customer.setEmail(rs.getString("email"));
//////                customer.setRemark(rs.getString("remark"));
//////                customerList.add(customer);
//////            }
//////            return customerList;
//////        } catch (SQLException e) {
//////            LOGGER.error("execute sql failure", e);
//////        } finally {
//////            DatabaseHelper.closeConnection(conn);
//////        }
//////        return null;
//////    }


    public List<Customer> getCustomerList() {
        String sql = "SELECT * FROM CUSTOMER";
        return DatabaseHelper.queryEntityList(Customer.class, sql);
    }
    public Customer getCustomer(long id) {
        String sql = "SELECT * FROM CUSTOMER WHERE id=?";
        return DatabaseHelper.queryEntity(Customer.class, sql, id);
    }

    public boolean createCustomer(Map<String, Object> fieldMap) {
        return DatabaseHelper.insertEntity(Customer.class, fieldMap);
    }

    public boolean updateCustomer(long id, Map<String, Object> fieldMap) {
        return DatabaseHelper.updateEntity(Customer.class, id, fieldMap);
    }

    public boolean deleteCustomer(long id) {
        return DatabaseHelper.deleteEntity(Customer.class, id);
    }

}
