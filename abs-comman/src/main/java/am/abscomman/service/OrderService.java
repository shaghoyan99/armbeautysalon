package am.abscomman.service;

import am.abscomman.repository.OrderRepository;
import am.abscomman.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class OrderService {

    private final OrderRepository orderRepo;
}
