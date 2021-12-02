package com.exemple.cinema.resource;

import com.exemple.cinema.dto.OrderDto;
import com.exemple.cinema.service.OrderService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1")
public class OrderResource {
    private final OrderService orderService;

    public OrderResource(OrderService orderService) {
        this.orderService = orderService;
    }

    @PostMapping("/order/")
    public OrderDto createOrder(@RequestBody OrderDto orderDto) {
        return orderService.createOrder(orderDto);
    }

    @GetMapping("/order/{id}")
    public OrderDto getById(@PathVariable Long id) {
        return orderService.getById(id);
    }

    @GetMapping("/order/")
    public List<OrderDto> getAll() {
        return orderService.getAll();
    }

    @GetMapping("/order/user/{userId}")
    public List<OrderDto> getAllByUserId(@PathVariable Long userId) {
        return orderService.getAllByUserId(userId);
    }

    @PutMapping("/order/")
    public OrderDto updateOrder(@RequestBody OrderDto orderDto) {
        return orderService.updateOrder(orderDto);
    }
}