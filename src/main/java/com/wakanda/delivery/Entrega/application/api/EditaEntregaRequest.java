package com.wakanda.delivery.Entrega.application.api;

import com.wakanda.delivery.Entrega.domain.StatusEntrega;
import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
public class EditaEntregaRequest {

        @NotNull(message = "Status não pode ser nulo")
        private StatusEntrega status;

        public EditaEntregaRequest(StatusEntrega status){
                this.status = status;
        }

}
