package am.abscomman.service;

import am.abscomman.repository.HairdresserRepository;
import am.abscomman.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class HairdresserService {

    private final HairdresserRepository hairdresserRepo;
}
