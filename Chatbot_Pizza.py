#feito por#
#wemerson de almeda souza#
#maxson almeida dourado#

import unicodedata

def normalize_text(s: str) -> str:
    nf = unicodedata.normalize("NFKD", s.strip().lower())
    return "".join(ch for ch in nf if not unicodedata.combining(ch))

def ask(prompt):
    return input(prompt + "\n> ").strip()

TAMANHOS = ["Pequena", "Média", "Grande", "Família"]
SABORES = ["Calabresa", "Mussarela", "Frango", "Portuguesa", "Quatro Queijos"]
BORDAS = ["Sem borda", "Catupiry", "Cheddar"]
BEBIDAS = ["Nenhuma", "Coca-Cola", "Guaraná", "Suco", "Água"]

def escolher_opcao(titulo, opcoes):
    print(f"\nBot: {titulo}")
    for i, opcao in enumerate(opcoes, start=1):
        print(f"{i}. {opcao}")
    while True:
        escolha = ask("Digite o número da opção desejada")
        if escolha.isdigit() and 1 <= int(escolha) <= len(opcoes):
            return opcoes[int(escolha) - 1]
        else:
            print("Bot: Opção inválida, tente novamente.")

def main():
    pedido = {
        "tamanho": None,
        "sabor": None,
        "borda": None,
        "bebida": None,
        "endereco": None,
        "pagamento": None
    }

    print("Bot:  Olá! Sou da pizzaria super 10. Diga 'quero pedir' para começar.")
    txt = normalize_text(ask("Você"))
    if "quero" not in txt and "pedir" not in txt:
        print("Bot: Pedido não iniciado. Encerrando.")
        return

    pedido["tamanho"] = escolher_opcao("Escolha o tamanho da pizza:", TAMANHOS)
    pedido["sabor"] = escolher_opcao("Escolha o sabor da pizza:", SABORES)
    pedido["borda"] = escolher_opcao("Escolha a borda da pizza:", BORDAS)
    pedido["bebida"] = escolher_opcao("Escolha sua bebida:", BEBIDAS)

    pedido["endereco"] = ask("Informe o endereço para entrega")
    pedido["pagamento"] = escolher_opcao("Forma de pagamento:", ["Pix", "Cartão de Crédito", "Cartão de Débito", "Dinheiro"])
    
    print("\n **RESUMO DO PEDIDO**")
    for k, v in pedido.items():
        print(f"- {k.capitalize()}: {v}")

    confirmar = normalize_text(ask("Digite 'confirmar' para finalizar ou 'cancelar'"))
    if "confirm" in confirmar:
        print("\n Pedido confirmado! Sua pizza chegará em aproximadamente 30 minutos.")
    else:
        print("\n❌ Pedido cancelado.")

if __name__ == "__main__":
    main()
