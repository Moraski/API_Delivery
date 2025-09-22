package com.wakanda.delivery.Entrega.application.api;

import com.wakanda.delivery.entrega.domain.StatusEntrega;
import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class EditaEntregaRequest {

        @NotNull(message = "Status não pode ser nulo")
        private StatusEntrega status;

}
