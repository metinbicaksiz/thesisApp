package com.bicaksiz.restaurantservice.dao;

import com.bicaksiz.restaurantservice.dto.OrderResponseDTO;
import org.springframework.stereotype.Component;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

@Component
public class RestaurantOrderDAO {


    public OrderResponseDTO getOrders(String orderId) {
        return generateRandomOrders().get(orderId);
    }

    private Map<String, OrderResponseDTO> generateRandomOrders() {
        Map<String, OrderResponseDTO> orderMap = new HashMap<>();
        orderMap.put("35fds631", new OrderResponseDTO("35fds63", "VEGGETERIAN PIZZA", 1, 199, new Date(), "Hazir", 15));
        orderMap.put("9u71245h", new OrderResponseDTO("9u71245h", "SPAGETTI", 2, 641, new Date(), "Hazirlaniyor", 59));
        orderMap.put("9u76285h", new OrderResponseDTO("9u76285h", "PACANGA", 2, 175, new Date(), "Dagitimda", 22));
        orderMap.put("37jbd832", new OrderResponseDTO("37jbd832", "CIBOREK", 1, 325, new Date(), "Teslim Edildi", 0));
        return orderMap;
    }

    public static void main(String[] args) {
        System.out.println("spagetti".toUpperCase());
    }


}
