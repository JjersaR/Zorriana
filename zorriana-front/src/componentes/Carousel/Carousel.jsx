import { useEffect, useState } from "react";
import { ArrowLeft, ArrowRight } from "./ArrowsIcons";
import "./Carousel.css";

const img = [
  "https://placehold.co/600x400",
  "https://placehold.co/600x400",
  "https://placehold.co/600x400",
];

const Carousel = () => {
  const [slide, setSlide] = useState(0);

  const nextSlide = () => setSlide(slide === img.length - 1 ? 0 : slide + 1);

  const prevSlide = () => setSlide(slide === 0 ? img.length - 1 : slide - 1);

  useEffect(() => {
    const timeOut = setTimeout(() => {
      setSlide(slide === img.length - 1 ? 0 : slide + 1);
    }, 5000);

    return () => {
      clearTimeout(timeOut);
    };
  }, [slide]);

  return (
    <article className="carousel">
      <ArrowLeft prevSlide={prevSlide} />
      {img.map((item, index) => (
        <img
          src={item}
          alt={`Img candy ${index}`}
          key={index}
          className={
            slide === index ? "slide slide-up-fade-in" : "slide slide-hidden"
          }></img>
      ))}
      <ArrowRight nextSlide={nextSlide} />
      <span className="indicators">
        {img.map((_, idx) => (
          <button
            key={idx}
            onClick={() => setSlide(idx)}
            className={
              slide === idx ? "indicator" : "indicator indicator-inactive"
            }></button>
        ))}
      </span>
    </article>
  );
};

export default Carousel;
