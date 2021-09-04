package com.hfut.controller;

import com.hfut.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class OrderController {
	
	@Autowired
	private OrderService orderService;
	
	// 如果参数过多  该如何接收？
	// seatStr  1-81-7 -> 1-8,1-7
	@RequestMapping("buy")
	@ResponseBody
	public int buyTicket(@RequestParam String playId,
	                     @RequestParam int cnt,
	                     @RequestParam String seatStr) {
		// 接收  play_id  room_id  已选座位数量  具体座位信息  根据单价校验订单总额
		return orderService.addOrder(playId, cnt, seatStr);
	}
	
	// 可以用类来接收
	//    public String buyTicket1(OrderVo orderVo) {}
	
	@RequestMapping("sold")
	@ResponseBody
	public List<String> sold(@RequestParam String playId) {
		List<String> seats = orderService.getSeatsByPlayId(playId);
		return seats;
	}
}
