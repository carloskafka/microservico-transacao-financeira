# microservico-transacao-financeira

# Ainda em desenvolvimento

Requisitos

- RabbitMQ

Cenário a ser desenvolvido:

1. Dado uma conta A e uma conta B, quando realizar a transferencia entre duas contas então realiza o debito na conta A e crédito na conta B

Fluxo

verifica atraves da versão da transação se a transação de debito ja foi executada 

o serviço de transferencia se comunica com o serviço de debito para debitar o valor da conta A

o serviço de debito manda um evento pro serviço de transferencia avisando que deu certo

o serviço de transferencia se comunica com o serviço de crédito para creditar na conta de destino B

o serviço de credito avisa pro serviço de transferencia que conseguiu

o serviço de transferencia salva a transferencia no banco de dados ou atualiza o status da operação de transferencia
