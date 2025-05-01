# Identidade, Acesso, Segurança

- Descrever os serviços de diretório da Azure, incluindo o Microsoft Entra ID e o Microsoft Entra Domain Services.

- Descrever métodos de autenticação no Azure, incluindo o SSO (login único), MFA (autenticação multifator) e sem senha.

# Domínios de Objetivo

- Descrever as identidades externas e o acesso de convidados no Azure

- Descrever o Acesso Condicional do Entra

- Descrever o controle de acesso baseado em função (RBAC).

### Cloud vs On-premise

- A pessoa que tem acesso no On-premise, acessa tudo

- Já no Cloud, é possível permitir acesso ou bloquear ações em serviços, entre outros

### Confiança Zero

"Desconfie de todos e não confie em ninguém"

Esse conceito na área de Cloud nos trás a ideia de que é necessário que o usuário tenha a mínima permissão necessária, além de que garantir que essa permissão está sendo validada

## Microsoft Entra ID - Antigo Microsoft Active Directory

É o serviço de gerenciamento de identidades e acesso baseado em nuvem do Azure

- Autenticação (os funcionários entram para acessar os recursos)
- Logon Único (SSO)
- Gerenciamento de aplicativos
- Negócios para Negócios (B2B)
- Gerenciamento de dispositivos

tudo isso é responsabilidade da Azure

## Domain Services

Obtenha os benefícios dos serviços de domínio baseados em nuvem sem gerenciar os controladores de domínio.

Execute aplicativos herdados (que não podem utilizar os padrões de autenticação modernos) em nuvem

Sincronizar automaticamente a partir do Microsoft Entra ID

## Microsoft Defender for Cloud - Cloud Native (nativa de núvem)

### Autenticação

- Identifica a pessoa ou serviço buscando acesso a um recurso.
- Solicita credenciais de acesso legítimo
- Base para criar princípios de identidade e controle de acesso seguros.